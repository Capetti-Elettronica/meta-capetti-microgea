# Copyright (C) 2015 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Capetti Gateway Relase Image"
LICENSE = "MIT"

inherit core-image

## Select Image Features
IMAGE_FEATURES += " \
	debug-tweaks \
	ssh-server-dropbear \
	hwcodecs \
	"

PKG_DEBUG = "\
	ethtool \
	i2c-tools \
	iproute2 \
	minicom \
	parted \
	serialtools \
	usbutils \
	imx6ull-lwb5plus \
	imx6ull-brcm \
	engicam-mtd-script \
	mtd-utils \
	mtd-utils-ubifs \
	imx-kobs \
	zstd \
	evtest \
"

IMAGE_INSTALL += " \
	brcm-patchram-plus \
	packagegroup-core-full-cmdline \
	packagegroup-tools-bluetooth \
	sqlite3 \
	mosquitto-clients \
	${PKG_DEBUG} \
"
