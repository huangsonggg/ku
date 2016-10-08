package jiCheng;

public class xueSheng extends ren {
	String xh;//定义学号
	
	//接收人的属性
	public xueSheng(String zl,String mz,int nl,String xb,String zx) {
		super(zl,mz,nl,xb);//使人的属性重置
		this.xh =zx;//使学号等于当前学号！
		System.out.println("一个学生出现了！");
	}
	//定义输出学生学号的方法
	void shengfen(){
		super.shengfen();//复写ren类里的方法
		System.out.println("这个学生长的学号是：" + this.xh + "!");
	}
}
