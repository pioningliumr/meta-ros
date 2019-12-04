# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Package for robot 2D self-localization using dynamic or static (MRPT or ROS) maps. 	The interface is similar to amcl (http://wiki.ros.org/amcl)    but supports different particle-filter algorithms, several grid maps at    different heights, range-only localization, etc."
AUTHOR = "Markus Bader <markus.bader@tuwien.ac.at>"
ROS_AUTHOR = "Markus Bader"
HOMEPAGE = "http://www.mrpt.org/"
SECTION = "devel"
LICENSE = "BSD & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mrpt_navigation"
ROS_BPN = "mrpt_localization"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
    mrpt-bridge \
    mrpt-msgs \
    mrpt1 \
    nav-msgs \
    pose-cov-ops \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    mrpt-bridge \
    mrpt-msgs \
    mrpt1 \
    nav-msgs \
    pose-cov-ops \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    mrpt-bridge \
    mrpt-msgs \
    mrpt1 \
    nav-msgs \
    pose-cov-ops \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/melodic/mrpt_localization/0.1.24-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/mrpt_localization"
SRC_URI = "git://github.com/mrpt-ros-pkg-release/mrpt_navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "644872523a646c4c4cc89c6942724bf76c5d9c4c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}