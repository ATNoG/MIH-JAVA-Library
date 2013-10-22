//==============================================================================
// Brief   : LINK_CFG_STATUS Data Type
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

package mih.types.links;

import mih.types.Serializeable;
import mih.types.basic.List;
import mih.types.basic.Sequence;
import mih.types.links.auxiliar.NullTimerIntervalChoice;

public class LinkCfgStatus
		extends
		Sequence<LinkParamType, NullTimerIntervalChoice, ThAction, List<Threshold>, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull>
		implements Serializeable {

	public LinkCfgStatus(LinkParamType linkParamType, NullTimerIntervalChoice timerInterval, ThAction thAction, List<Threshold> thresholdList) {
		super(linkParamType, timerInterval, thAction, thresholdList);
	}

	public LinkCfgStatus(LinkCfgStatus value) {
		super(value.getLinkParamType(), value.getTimerInterval(), value.getThAction(), value.getThresholdList());
	}

	public LinkCfgStatus() {
		super(new LinkParamType(), new NullTimerIntervalChoice(), new ThAction(), new List<Threshold>(Threshold.class));
	}

	public LinkParamType getLinkParamType() {
		return getA();
	}

	public void setLinkParamType(LinkParamType linkParamType) {
		setA(linkParamType);
	}

	public NullTimerIntervalChoice getTimerInterval() {
		return getB();
	}

	public void setTimerInterval(NullTimerIntervalChoice timerInterval) {
		setB(timerInterval);
	}

	public ThAction getThAction() {
		return getC();
	}

	public void setThAction(ThAction thAction) {
		setC(thAction);
	}

	public List<Threshold> getThresholdList() {
		return getD();
	}

	public void setThresholdList(List<Threshold> thresholdList) {
		setD(thresholdList);
	}
}
