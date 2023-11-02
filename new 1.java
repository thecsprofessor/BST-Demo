
public static intBSTnode maxValue(intBSTnode p) {
	if (p == null)
		return null;
	else {
		if (p.right == null)
			return p;
		else
			return maxValue(p.right);
	}
}

public static intBSTnode minValue(intBSTnode p) {
	if (p == null) {
		return null;
	}
	else {
		if (p.left == null)
			return p;
		else
			return minValue(p.left);
	}
}

public static boolean search(intBSTnode p, int value) {
	if (p == null)
		return false;
	else {
		if (value == p.data)
			return true;
		else if (value < p.data)
			return search(p.left, value);
		else
			return search(p.right, value);
	}
}

public static int countNodes(intBSTnode p) {
	if (p == null)
		return 0;
	else {
		return 1 + countNodes(p.left) + countNodes(p.right);
	}
}

public static int sumNodes(intBSTnode p) {
	if (p == null)
		return 0;
	else {
		return p.data + sumNodes(p.left) + sumNodes(p.right);
	}
}

public static boolean hasOnlyLeftChild(intBSTnode p) {
	return p.left != null && p.right == null;
}

public static boolean hasOnlyRightChild(intBSTnode p) {
	return p.left == null && p.right != null;
}

public static boolean isLeaf(intBSTnode p) {
	return p.left == null && p.right == null;
}

public static boolean isEmpty(intBSTnode p) {
	return p == null;
}

public static intBSTnode insert (intBSTnode root, int value) {
	// IF tree is empty
	if (root == null) {
		root = new intBSTnode(value);
		return root;
	}
	else {
		// insert value to the left OR to the right
		if (value < root.data) {
			root.left = insert(root.left, value);
		}
		else {
			root.right = insert(root.right, value);
		}
	}
}