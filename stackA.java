package Stack;

public class stackA {
	int top = -1;

	int A[] = new int[10]; // create a list so we can use it as a stack

	// insert function here we will insert to the last item , LIFO
	void push(int value) {
		// first we increment the top variable the we set the data
		top++;
		A[top] = value;
	}

	void pop() {
		// decrement the top variable
		top--;
	}

	void Isempty() {
		// the starts from 0 , so if the top = -1 , then it is empty
		if (top == -1) {
			System.out.print(true);
			;
		} else {
			System.out.print(false);
			;
		}

	}

	void print() {

		System.out.print("[");
		for (int i = 0; i <= top; i++) {
			System.out.print(A[i] + ", ");

		}
		System.out.print(" ]");
	}

}
