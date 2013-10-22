//==============================================================================
// Brief   : MIH_Net_HO_Commit Indication Message
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

import mih.tlvs.AssignedResourceSetTlv;
import mih.tlvs.LinkActionListTlv;
import mih.tlvs.LinkTypeTlv;
import mih.tlvs.ListOfTargetNetworkInfoTlv;
import mih.tlvs.TimeIntervalTlv;
import mih.types.Serializeable;
import mih.types.basic.List;
import mih.types.basic.UnsignedInteger16;
import mih.types.handover.AsgnResSet;
import mih.types.handover.TgtNetInfo;
import mih.types.links.LinkActionReq;
import mih.types.links.LinkType;

public class MihNetHoCommitIndication extends Message implements
		Serializeable {

	public MihNetHoCommitIndication() {
		super();
		mid = MIH_Net_HO_Commit_indication;
		tlvList.add(new TlvInfo(new LinkTypeTlv(), false));
		tlvList.add(new TlvInfo(new ListOfTargetNetworkInfoTlv(), false));
		tlvList.add(new TlvInfo(new AssignedResourceSetTlv(), false));
		tlvList.add(new TlvInfo(new TimeIntervalTlv(), false));
		tlvList.add(new TlvInfo(new LinkActionListTlv(), true));
	}

	public MihNetHoCommitIndication(int version, boolean ack_req,
			boolean ack_rsp, boolean uir, boolean m, int fn, boolean rsvd1,
			int rsvd2, int tid) {
		super(version, ack_req, ack_rsp, uir, m, fn, rsvd1,
				MIH_Net_HO_Commit_indication, rsvd2, tid);
		tlvList.add(new TlvInfo(new LinkTypeTlv(), false));
		tlvList.add(new TlvInfo(new ListOfTargetNetworkInfoTlv(), false));
		tlvList.add(new TlvInfo(new AssignedResourceSetTlv(), false));
		tlvList.add(new TlvInfo(new TimeIntervalTlv(), false));
		tlvList.add(new TlvInfo(new LinkActionListTlv(), true));
	}

	public LinkType getLinkTypeTlv() {
		return ((LinkTypeTlv)tlvList.get(0).getTlv()).getValue();
	}

	public void setLinkTypeTlv(LinkType value) {
		((LinkTypeTlv)tlvList.get(0).getTlv()).setValue(value);
	}

	public List<TgtNetInfo> getListOfTargetNetworkInfoTlv() {
		return ((ListOfTargetNetworkInfoTlv)tlvList.get(1).getTlv()).getValue();
	}

	public void setListOfTargetNetworkInfoTlv(List<TgtNetInfo> value) {
		((ListOfTargetNetworkInfoTlv)tlvList.get(1).getTlv()).setValue(value);
	}

	public AsgnResSet getAssignedResourceSetTlv() {
		return ((AssignedResourceSetTlv)tlvList.get(2).getTlv()).getValue();
	}

	public void setAssignedResourceSetTlv(AsgnResSet value) {
		((AssignedResourceSetTlv)tlvList.get(2).getTlv()).setValue(value);
	}

	public UnsignedInteger16 getTimeIntervalTlv() {
		return ((TimeIntervalTlv)tlvList.get(3).getTlv()).getValue();
	}

	public void setTimeIntervalTlv(UnsignedInteger16 value) {
		((TimeIntervalTlv)tlvList.get(3).getTlv()).setValue(value);
	}

	public boolean hasLinkActionListTlv() {
		return tlvList.get(4).getTlv().isInitialized();
	}

	public List<LinkActionReq> getLinkActionListTlv() {
		return ((LinkActionListTlv)tlvList.get(4).getTlv()).getValue();
	}

	public void setLinkActionListTlv(List<LinkActionReq> value) {
		((LinkActionListTlv)tlvList.get(4).getTlv()).setValue(value);
	}
}
