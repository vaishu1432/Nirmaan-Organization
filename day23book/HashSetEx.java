package day23;

import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
	BookSet bs =new BookSet(101,"java",100);
	BookSet bs1 =new BookSet(102,"java",100);
	HashSet<BookSet> hs = new HashSet<BookSet>();
	hs.add(bs);
	hs.add(bs1);
	System.out.println(hs);
	}

}
