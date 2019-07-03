# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Ros navigation utilities."
AUTHOR = "Daniel Stonier <stonier@yujinrobot.com>"
ROS_AUTHOR = "Daniel Stonier"
HOMEPAGE = "https://github.com/yujinrobot/yujin_ocs"
SECTION = "devel"
LICENSE = "Yujin-Robot"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=a9f99b3452a89416bf7474e0b60ab849"

ROS_CN = "yujin_ocs"
ROS_BPN = "yocs_navi_toolkit"

ROS_BUILD_DEPENDS = " \
    base-local-planner \
    costmap-2d \
    ecl-build \
    ecl-linear-algebra \
    nav-msgs \
    roscpp \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    base-local-planner \
    costmap-2d \
    ecl-build \
    ecl-linear-algebra \
    nav-msgs \
    roscpp \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    base-local-planner \
    costmap-2d \
    ecl-build \
    ecl-linear-algebra \
    nav-msgs \
    roscpp \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_navi_toolkit/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4e1b03795f803e7f41be2595fee40357"
SRC_URI[sha256sum] = "fbf635ac9b081ac52ced067b1d5b6ffdb7c17a320ba7d229e92d53538a44ac5f"
S = "${WORKDIR}/yujin_ocs-release-release-melodic-yocs_navi_toolkit-0.8.2-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('yujin-ocs', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('yujin-ocs', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/yujin-ocs/yujin-ocs_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/yujin-ocs/yujin-ocs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/yujin-ocs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/yujin-ocs/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}