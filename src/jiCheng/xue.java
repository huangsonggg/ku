package jiCheng;

public class xue extends renlei{
	String xh;//����ѧ��
	xue(String mz,int nl,String xb,String xh) {
		super(mz,nl,xb);//ʹ�˵���������
		this.xh = xh;//ʹѧ�ŵ��ڵ�ǰѧ�ţ�
		System.out.println("һ��ѧ�������ˣ�");
	}
	//�������ѧ��ѧ�ŵķ���
	void shengfen(){
		super.shengfen();//��дren����ķ���
		System.out.println("���ѧ����ѧ���ǣ�" + this.xh + "!");
	}
}
