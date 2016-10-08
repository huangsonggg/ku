package jiCheng;

public class ren extends dongWu{
	//定义人属性
		String mz;//定义名字
		int nl;//定义年龄
		String xb;//定义性别
	//接收人的属性和动物的种类
		public ren(String zl,String mz,int nl,String xb){
			super(zl);//使动物的属性重置
			
			//使人的属性等于当前属性！
			this.mz = mz;
			this.nl = nl;
			this.xb = xb;
			System.out.println("一个人诞生了!");
	}
	//定义输出人属性的方法
	void shengfen(){
		super.shengfen();
		System.out.println("这个人的名字是：" + this.mz);
		System.out.println("这个人的年龄是：" + this.nl);
		System.out.println("这个人的性别是：" + this.xb);
	}
}
