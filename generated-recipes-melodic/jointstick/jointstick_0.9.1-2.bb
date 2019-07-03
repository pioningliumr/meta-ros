# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Move any joint with any controller!"
AUTHOR = "George Stavrinos <stavrinosgeo@gmail.com>"
ROS_AUTHOR = "George Stavrinos <stavrinosgeo@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=4633480cdd27d7906aaf3ef4b72014b2"

ROS_CN = "jointstick"
ROS_BPN = "jointstick"

ROS_BUILD_DEPENDS = " \
    controller-manager-msgs \
    geometry-msgs \
    nav-msgs \
    sensor-msgs \
    std-msgs \
    trajectory-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    controller-manager-msgs \
    geometry-msgs \
    nav-msgs \
    sensor-msgs \
    std-msgs \
    trajectory-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    controller-manager-msgs \
    geometry-msgs \
    nav-msgs \
    sensor-msgs \
    std-msgs \
    trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/gstavrinos/jointstick-release/archive/release/melodic/jointstick/0.9.1-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "32154decc6d7e623a9b96ab16a99a694"
SRC_URI[sha256sum] = "40810fdb769af4467b634649a2cfabf49337ae5e00fe08f034fe0555036ba39f"
S = "${WORKDIR}/jointstick-release-release-melodic-jointstick-0.9.1-2"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('jointstick', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('jointstick', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jointstick/jointstick_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jointstick/jointstick-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jointstick/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jointstick/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}