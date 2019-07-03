# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Listens on a ImageFeatures topic, and waits for the data to settle.      This package is experimental and unstable.      Expect its APIs to change."
AUTHOR = "Vincent Rabaud <vincent.rabaud@gmail.com>"
ROS_AUTHOR = "Vijay Pradeep"
HOMEPAGE = "http://www.ros.org/wiki/monocam_settler"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "calibration"
ROS_BPN = "monocam_settler"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    rosconsole \
    roscpp-serialization \
    settlerlib \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    rosconsole \
    roscpp-serialization \
    settlerlib \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    rosconsole \
    roscpp-serialization \
    settlerlib \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/melodic/monocam_settler/0.10.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4ae91876c0e6c619b66ca28af2e5b4dd"
SRC_URI[sha256sum] = "e071a63f48ee1ed211bca1e5bcd85a46afce004dc18ba4226aee484dc7e309c7"
S = "${WORKDIR}/calibration-release-release-melodic-monocam_settler-0.10.14-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('calibration', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('calibration', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/calibration/calibration_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/calibration/calibration-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/calibration/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/calibration/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}