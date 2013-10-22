//==============================================================================
// Brief   : LINK_ACTION Data Type
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

public class LinkAction
		extends
		Sequence<LinkAcType, LinkAcAttr, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull>
		implements Serializeable {

	public LinkAction(LinkAcType type, LinkAcAttr attr) {
		super(type, attr);
	}

	public LinkAction(LinkAction value) {
		super(value.getType(), value.getAttr());
	}

	public LinkAction() {
		super(new LinkAcType(), new LinkAcAttr());
	}

	public LinkAcType getType() {
		return getA();
	}

	public void setType(LinkAcType type) {
		setA(type);
	}

	public LinkAcAttr getAttr() {
		return getB();
	}

	public void setAttr(LinkAcAttr attr) {
		setB(attr);
	}
}
