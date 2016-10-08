package jiCheng;

public class xue extends renlei{
	String xh;//定义学号
	xue(String mz,int nl,String xb,String xh) {
		super(mz,nl,xb);//使人的属性重置
		this.xh = xh;//使学号等于当前学号！
		System.out.println("一个学生出现了！");
	}
	//定义输出学生学号的方法
	void shengfen(){
		super.shengfen();//复写ren类里的方法
		System.out.println("这个学生的学号是：" + this.xh + "!");
	}
}
