package jiCheng;

public class dongWu {
		String zl;//定义种类
	
		//构造函数
		dongWu() {
			System.out.println("一个动物诞生了！");
			}		
		dongWu(String zl){
			this();//调用静态函数
			this.zl = zl;//使种类等于当前种类！
			
		}
		
		//输出动物种类的方法！
		void shengfen(){
			System.out.println("这个动物的种类是:" + this.zl);
			
		}
}
