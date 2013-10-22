//==============================================================================
// Brief   : LINK_PARAM_RPT Data Type
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
import mih.types.basic.Sequence;
import mih.types.links.auxiliar.NullThresholdChoice;

public class LinkParamRpt
		extends
		Sequence<LinkParam, NullThresholdChoice, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull>
		implements Serializeable {

	public LinkParamRpt(LinkParam linkParam, NullThresholdChoice threshold) {
		super(linkParam, threshold);
	}

	public LinkParamRpt(LinkParamRpt value) {
		super(value.getLinkParam(), value.getThreshold());
	}

	public LinkParamRpt() {
		super(new LinkParam(), new NullThresholdChoice());
	}

	public LinkParam getLinkParam() {
		return getA();
	}

	public void setLinkParam(LinkParam linkParam) {
		setA(linkParam);
	}

	public NullThresholdChoice getThreshold() {
		return getB();
	}

	public void setThreshold(NullThresholdChoice threshold) {
		setB(threshold);
	}
}
