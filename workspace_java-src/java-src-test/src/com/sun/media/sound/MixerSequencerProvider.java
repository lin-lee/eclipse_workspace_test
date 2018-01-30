/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.sun.media.sound;

import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.spi.MidiDeviceProvider;

/**
 * Provider for MixerSequencer objects.
 *
 * @version %I%, %E%
 * @author Kara Kytle
 */
public class MixerSequencerProvider extends MidiDeviceProvider {


    public MidiDevice.Info[] getDeviceInfo() {

	HeadspaceMixer mixer = HeadspaceMixer.getMixerInstance();
	if ((mixer != null) && mixer.audioDeviceExists()) {
	    MidiDevice.Info[] localInfo = { MixerSequencer.info };
	    return localInfo;
	}
	return new MidiDevice.Info[0];
    }


    public MidiDevice getDevice(MidiDevice.Info info) {

	HeadspaceMixer mixer = HeadspaceMixer.getMixerInstance();
	if ((mixer == null) || !mixer.audioDeviceExists()) {
	    return null;
	}

	if ((info != null) && (!info.equals(MixerSequencer.info))) {
	    return null;
	}

	try {
	    return new MixerSequencer();
	} catch (MidiUnavailableException e) {
	    return null;
	}
    }
}
