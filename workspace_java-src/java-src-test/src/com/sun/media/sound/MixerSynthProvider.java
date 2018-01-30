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
 * Provider for MixerSynth objects.
 *
 * @version %I%, %E%
 * @author Kara Kytle
 */
public class MixerSynthProvider extends MidiDeviceProvider {


    public MidiDevice.Info[] getDeviceInfo() {

	HeadspaceMixer mixer = HeadspaceMixer.getMixerInstance();
	if ((mixer != null) && mixer.audioDeviceExists()) {
	    MidiDevice.Info[] localInfo = { MixerSynth.info };
	    return localInfo;
	}
	return new MidiDevice.Info[0];
    }


    public MidiDevice getDevice(MidiDevice.Info info) {

	HeadspaceMixer mixer = HeadspaceMixer.getMixerInstance();
	if ((mixer == null) || !mixer.audioDeviceExists()) {
	    return null;
	}

	if ( (info != null) && (!info.equals(MixerSynth.info)) ) {
	    return null;
	}

	try {
	    return new MixerSynth();
	} catch (MidiUnavailableException e) {
	    return null;
	}
    }
}
