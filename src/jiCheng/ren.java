package jiCheng;

public class ren extends dongWu{
	//����������
		String mz;//��������
		int nl;//��������
		String xb;//�����Ա�
	//�����˵����ԺͶ��������
		public ren(String zl,String mz,int nl,String xb){
			super(zl);//ʹ�������������
			
			//ʹ�˵����Ե��ڵ�ǰ���ԣ�
			this.mz = mz;
			this.nl = nl;
			this.xb = xb;
			System.out.println("һ���˵�����!");
	}
	//������������Եķ���
	void shengfen(){
		super.shengfen();
		System.out.println("����˵������ǣ�" + this.mz);
		System.out.println("����˵������ǣ�" + this.nl);
		System.out.println("����˵��Ա��ǣ�" + this.xb);
	}
}
