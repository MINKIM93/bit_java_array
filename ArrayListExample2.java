import java.util.*;
public class ArrayListExample2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("����");
		list.add("����");
		list.add("������");
		list.add(2,"Ű��");
		list.set(0, "������");
		list.remove(1);
		list.remove("Ű��");
		int num = list.size();
		for (int cnt = 0; cnt < num; cnt++) {
			String str = list.get(cnt);
			System.out.println(str);
		}
		System.out.println("-----------------------"); // ����Ʈ������ŭ �ڵ��ݺ�
		for (String str : list) {
			System.out.println(str);
		}
	}

}
