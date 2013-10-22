//==============================================================================
// Brief   : MIH_Register Confirm Message
// Authors : Carlos Guimarães <cguimaraes@av.it.pt>
//------------------------------------------------------------------------------
// ODTONE - Open Dot Twenty One
//
// Copyright (C) 2013 Universidade Aveiro
// Copyright (C) 2013 Instituto de Telecomunicações - Pólo Aveiro
//
// This file is part of MIH-JAVA-Library.
//
// MIH-JAVA-Library is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 2.1 of the License, or
// (at your option) any later version.
//
// MIH-JAVA-Library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with MIH-JAVA-Library. If not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
//==============================================================================

package mih.message;

import mih.tlvs.StatusTlv;
import mih.tlvs.ValidTimeIntervalTlv;
import mih.types.Serializeable;
import mih.types.basic.UnsignedInteger32;
import mih.types.general.Status;

public class MihRegisterConfirm extends Message implements
		Serializeable {

	public MihRegisterConfirm() {
		super();
		mid = MIH_Register_confirm;
		tlvList.add(new TlvInfo(new StatusTlv(), false));
		tlvList.add(new TlvInfo(new ValidTimeIntervalTlv(), true));
	}

	public MihRegisterConfirm(int version, boolean ack_req,
			boolean ack_rsp, boolean uir, boolean m, int fn, boolean rsvd1,
			int rsvd2, int tid) {
		super(version, ack_req, ack_rsp, uir, m, fn, rsvd1,
				MIH_Register_confirm, rsvd2, tid);
		tlvList.add(new TlvInfo(new StatusTlv(), false));
		tlvList.add(new TlvInfo(new ValidTimeIntervalTlv(), true));
	}

	public Status getStatusTlv() {
		return ((StatusTlv) tlvList.get(0).getTlv()).getValue();
	}

	public void setStatusTlv(Status value) {
		((StatusTlv) tlvList.get(0).getTlv()).setValue(value);
	}

	public boolean hasValidTimeIntervalTlv() {
		return tlvList.get(1).getTlv().isInitialized();
	}

	public UnsignedInteger32 getValidTimeIntervalTlv() {
		return ((ValidTimeIntervalTlv) tlvList.get(1).getTlv()).getValue();
	}

	public void setValidTimeIntervalTlv(UnsignedInteger32 value) {
		((ValidTimeIntervalTlv) tlvList.get(1).getTlv()).setValue(value);
	}

}
