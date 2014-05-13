package com.lajv;

import com.lajv.vivaldi.VivaldiCoordinate;

import peersim.core.Node;

public class NodeWrapper {
	public Node node;
	public int age;
	public VivaldiCoordinate coord;
	public double distance;

	public NodeWrapper(Node node) {
		this.node = node;
		this.age = 0;
	}

	public NodeWrapper cyclonCopy() {
		NodeWrapper nw = new NodeWrapper(node);
		nw.age = age;
		return nw;
	}

	public NodeWrapper closePeerCopy() {
		NodeWrapper copy = new NodeWrapper(node);
		copy.coord = (VivaldiCoordinate) coord.clone();
		copy.distance = distance;
		return copy;
	}

	@Override
	public String toString() {
		return "(" + node.getID() + ")";
	}
}
