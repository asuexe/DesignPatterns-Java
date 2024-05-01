package DAA2;


public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void add(int digit) {
        Node newNode = new Node(digit);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.digit);
            current = current.next;
        }
        System.out.println();
    }

public static LinkedList addition(LinkedList a, LinkedList b) {
    LinkedList result = new LinkedList();
    Node currA = a.head;
    Node currB = b.head;
    int carry = 0;
    while (currA != null || currB != null) {
        int sum = carry;
        if (currA != null) {
            sum += currA.digit;
            currA = currA.next;
        }
        if (currB != null) {
            sum += currB.digit;
            currB = currB.next;
        }
        carry = sum / 10;
        sum = sum % 10;
        result.add(sum);
    }
    if (carry > 0) {
        result.add(carry);
    }
    return result;
}

public static LinkedList subtract(LinkedList a, LinkedList b) {
    LinkedList result = new LinkedList();
    Node currA = a.head;
    Node currB = b.head;
    int borrow = 0;
    while (currA != null) {
        int diff = borrow + currA.digit;
        if (currB != null) {
            diff -= currB.digit;
            currB = currB.next;
        }
        if (diff < 0) {
            diff += 10;
            borrow = -1;
        } else {
            borrow = 0;
        }
        result.add(diff);
        currA = currA.next;
    }
    return result;
}

public static LinkedList multiply(LinkedList a, LinkedList b) {
    LinkedList result = new LinkedList();
    Node currB = b.head;
    while (currB != null) {
        LinkedList temp = new LinkedList();
        int carry = 0;
        Node currA = a.head;
        while (currA != null) {
            int prod = carry + currA.digit * currB.digit;
            carry = prod / 10;
            prod = prod % 10;
            temp.add(prod);
            currA = currA.next;
        }
        if (carry > 0) {
            temp.add(carry);
        }
        for (int i = 0; i < result.size(); i++) {
            temp.addFirst(0);
        }
        result = add(result, temp);
        currB = currB.next;
    }
    return result;
}

public static LinkedList power(LinkedList a, int n) {
    LinkedList result = new LinkedList();
    result.add(1);
    while (n > 0) {
        if (n % 2 == 1) {
            result = multiply(result, a);
        }
        a = multiply(a, a);
        n /= 2;
    }
    return result;
}

}