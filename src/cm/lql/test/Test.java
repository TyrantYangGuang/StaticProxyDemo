package cm.lql.test;

import cm.lql.dao.impl.Zhangsan;
import cm.lql.proxy.PayProxy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zhangsan zhangsan = new Zhangsan();
		PayProxy payProxy = new PayProxy(zhangsan);
		payProxy.payMoney();
	}
	

}
