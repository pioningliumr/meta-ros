# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The interactive_marker_tutorials package"
AUTHOR = "William Woodall <william@osrfoundation.org>"
ROS_AUTHOR = "David Gossow"
HOMEPAGE = "http://ros.org/wiki/interactive_marker_tutorials"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "visualization_tutorials"
ROS_BPN = "interactive_marker_tutorials"

ROS_BUILD_DEPENDS = " \
    interactive-markers \
    roscpp \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    interactive-markers \
    roscpp \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    interactive-markers \
    roscpp \
    tf \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/visualization_tutorials-release/archive/release/melodic/interactive_marker_tutorials/0.10.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d567334a19a5f9cb20e93d11e654cc3a"
SRC_URI[sha256sum] = "9871ffc4468273f1bd8f38a84e6dafa224057f8ebd89db86e0ab174ab46c06eb"
S = "${WORKDIR}/visualization_tutorials-release-release-melodic-interactive_marker_tutorials-0.10.3-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('visualization-tutorials', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('visualization-tutorials', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/visualization-tutorials/visualization-tutorials_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/visualization-tutorials/visualization-tutorials-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/visualization-tutorials/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/visualization-tutorials/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}