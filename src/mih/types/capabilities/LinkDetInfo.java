//==============================================================================
// Brief   : LINK_DET_INFO Data Type
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

package mih.types.capabilities;

import mih.types.Serializeable;
import mih.types.basic.Sequence;
import mih.types.basic.UnsignedInteger16;
import mih.types.informationelements.NetAuxId;
import mih.types.informationelements.NetCaps;
import mih.types.informationelements.NetworkId;
import mih.types.links.LinkDataRate;
import mih.types.links.LinkMihcapFlag;
import mih.types.links.LinkTupleId;
import mih.types.links.SigStrength;

public class LinkDetInfo
		extends
		Sequence<LinkTupleId, NetworkId, NetAuxId, SigStrength, UnsignedInteger16, LinkDataRate, LinkMihcapFlag, NetCaps, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull>
		implements Serializeable {

	public LinkDetInfo(LinkTupleId linkTupleId, NetworkId networkId, NetAuxId netAuxId, SigStrength sigStrength, UnsignedInteger16 sinr, LinkDataRate linkDataRate, LinkMihcapFlag linkMihcapFlag, NetCaps netCaps) {
		super(linkTupleId, networkId, netAuxId, sigStrength, sinr, linkDataRate, linkMihcapFlag, netCaps);
	}

	public LinkDetInfo(LinkDetInfo value) {
		super(value.getLinkTupleId(), value.getNetworkId(), value.getNetAuxId(), value.getSigStrength(), value.getSinr(), value.getLinkDataRate(), value.getLinkMihcapFlag(), value.getNetCaps());
	}

	public LinkDetInfo() {
		super(new LinkTupleId(), new NetworkId(), new NetAuxId(), new SigStrength(), new UnsignedInteger16(), new LinkDataRate(), new LinkMihcapFlag(), new NetCaps());
	}

	public LinkTupleId getLinkTupleId() {
		return getA();
	}

	public void setLinkTupleId(LinkTupleId linkTupleId) {
		setA(linkTupleId);
	}

	public NetworkId getNetworkId() {
		return getB();
	}

	public void setNetworkId(NetworkId networkId) {
		setB(networkId);
	}

	public NetAuxId getNetAuxId() {
		return getC();
	}

	public void setNetAuxId(NetAuxId netAuxId) {
		setC(netAuxId);
	}

	public SigStrength getSigStrength() {
		return getD();
	}

	public void setSigStrength(SigStrength sigStrength) {
		setD(sigStrength);
	}

	public UnsignedInteger16 getSinr() {
		return getE();
	}

	public void setSinr(UnsignedInteger16 sinr) {
		setE(sinr);
	}

	public LinkDataRate getLinkDataRate() {
		return getF();
	}

	public void setLinkDataRate(LinkDataRate linkDataRate) {
		setF(linkDataRate);
	}

	public LinkMihcapFlag getLinkMihcapFlag() {
		return getG();
	}

	public void setLinkMihcapFlag(LinkMihcapFlag linkMihcapFlag) {
		setG(linkMihcapFlag);
	}

	public NetCaps getNetCaps() {
		return getH();
	}

	public void setNetCaps(NetCaps netCaps) {
		setH(netCaps);
	}
}
