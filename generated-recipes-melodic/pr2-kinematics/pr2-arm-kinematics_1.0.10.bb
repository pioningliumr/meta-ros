# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This package provides a kinematics implementation for the PR2 robot. It can be used to compute forward and inverse kinematics."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "Sachin Chitta"
HOMEPAGE = "http://ros.org/wiki/pr2_arm_kinematics"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_kinematics"
ROS_BPN = "pr2_arm_kinematics"

ROS_BUILD_DEPENDS = " \
    angles \
    cmake-modules \
    geometry-msgs \
    kdl-parser \
    moveit-core \
    moveit-msgs \
    pluginlib \
    roscpp \
    tf-conversions \
    urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    angles \
    geometry-msgs \
    kdl-parser \
    moveit-core \
    moveit-msgs \
    pluginlib \
    roscpp \
    tf-conversions \
    urdf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    angles \
    geometry-msgs \
    kdl-parser \
    moveit-core \
    moveit-msgs \
    pluginlib \
    roscpp \
    tf-conversions \
    urdf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/pr2_kinematics-release/archive/release/melodic/pr2_arm_kinematics/1.0.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "72d87b23543dea22a62ddd7fee5999cd"
SRC_URI[sha256sum] = "ad182e7a84e3e1448a25ab252edae3155e4cb6d27180b1c16e56ce29c656677d"
S = "${WORKDIR}/pr2_kinematics-release-release-melodic-pr2_arm_kinematics-1.0.10-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('pr2-kinematics', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('pr2-kinematics', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-kinematics/pr2-kinematics_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-kinematics/pr2-kinematics-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-kinematics/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-kinematics/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}