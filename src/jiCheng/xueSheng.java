package jiCheng;

public class xueSheng extends ren {
	String xh;//����ѧ��
	
	//�����˵�����
	public xueSheng(String zl,String mz,int nl,String xb,String zx) {
		super(zl,mz,nl,xb);//ʹ�˵���������
		this.xh =zx;//ʹѧ�ŵ��ڵ�ǰѧ�ţ�
		System.out.println("һ��ѧ�������ˣ�");
	}
	//�������ѧ��ѧ�ŵķ���
	void shengfen(){
		super.shengfen();//��дren����ķ���
		System.out.println("���ѧ������ѧ���ǣ�" + this.xh + "!");
	}
}
