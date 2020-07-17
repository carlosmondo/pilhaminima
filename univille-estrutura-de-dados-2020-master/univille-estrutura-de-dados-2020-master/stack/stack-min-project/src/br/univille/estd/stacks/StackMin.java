package br.univille.estd.stacks;

public class StackMin<E> implements Stack<E> {
	protected int capacity;
	public static final int CAPACITY = 3000;
	protected E S[];
	protected int top = 0;
	public StackMin() {
		this(CAPACITY);
	}
	@SuppressWarnings("unchecked")
	public StackMin(int capacity) {
		this.capacity = capacity;
		S = (E[])new Object[this.capacity];
	}

	@Override
	public int size() {
		return top;
	}

	@Override
	public boolean isEmpty() {
		if (top == 0){
			return true;
		}
		return false;
	}

	@Override
	public E top() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException("Pilha vazia!");
		}
		return S[top -1];
	}

	@Override
	public void push(E element) {
		S[top] = element;
		top++;
	}

	@Override
	public E pop() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException("Pilha vazia!");
		}
		E element = S[top-1];
		--top;
		return element;
	}

	//este metodo pega o minimo elemento da pilha e o retorna
	@Override
	public E min() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException("Pilha vazia!");
		}
		E min = S[0];
		return min;
	}
	
}
