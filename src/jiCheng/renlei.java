package jiCheng;

public class renlei {
	//����������
		String mz;//��������
		int nl;//��������
		String xb;//�����Ա�
		//�����˵����ԺͶ��������
	renlei() {
			System.out.println("һ���˵�����!");
	}
	renlei(String mz,int nl,String xb){
			this();
		//ʹ�˵����Ե��ڵ�ǰ���ԣ�
			this.mz = mz;
			this.nl = nl;
			this.xb = xb;
		
	}
		//������������Եķ���
	void shengfen(){
		
		System.out.println("����˵������ǣ�" + this.mz);
		System.out.println("����˵������ǣ�" + this.nl);
		System.out.println("����˵��Ա��ǣ�" + this.xb);

	}
}
