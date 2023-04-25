# Copyright 2013-2016 (C) Freescale Semiconductor
# Copyright 2017-2023 (C) NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)
#
# SPDX-License-Identifier: MIT
#

SUMMARY = "Linux Kernel provided and supported by NXP"
DESCRIPTION = "Linux Kernel provided and supported by NXP with focus on \
i.MX Family Reference Boards. It includes support for many IPs such as GPU, VPU and IPU."

require recipes-kernel/linux/linux-imx.inc

DEPENDS += "lzop-native bc-native"

# UPGRADE NOTE:
# The linux-imx kernel build uses a defconfig maintained in the layer. That
# defconfig is a copy of a defconfig maintained by NXP in the source.
# | SOURCE                              | LAYER                           |
# | arch/arm/configs/imx_v7_defconfig   | linux-imx/imx-nxp-bsp/defconfig |
# | arch/arm64/configs/imx_v8_defconfig | linux-imx/mx8-nxp-bsp/defconfig |
# | arch/arm64/configs/imx_v8_defconfig | linux-imx/mx9-nxp-bsp/defconfig |
SRCBRANCH = "lf-6.1.y"
LOCALVERSION = "-6.1.1-1.0.0"
SRCREV = "29549c7073bf72cfb2c4614d37de45ec36b60475"

# PV is defined in the base in linux-imx.inc file and uses the LINUX_VERSION definition
# required by kernel-yocto.bbclass.
#
# LINUX_VERSION define should match to the kernel version referenced by SRC_URI and
# should be updated once patchlevel is merged.
LINUX_VERSION = "6.1.1"

DEFAULT_PREFERENCE = "1"

COMPATIBLE_MACHINE = "(imx-nxp-bsp)"