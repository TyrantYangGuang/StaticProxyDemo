package cm.lql.proxy;

import cm.lql.dao.IPayMoney;
import cm.lql.dao.impl.Zhangsan;

public class PayProxy implements IPayMoney {
	private IPayMoney obj;

	public PayProxy(IPayMoney obj) {
		super();
		this.obj = obj;
	}

	@Override
	public void payMoney() {
		// TODO Auto-generated method stub
		System.out.println("׼������");
		obj.payMoney();
		System.out.println("��β����");
	}
	
	

}
