package com.base.dp.structure.bridge;

public class OralcleJdbcDriver extends JdbcDriver{

	static{
		DriverManager.setJdbcDriver(new OralcleJdbcDriver());
	}
	@Override
	public Connection buildConnection(String url) {
		System.out.println("oracle build connection from "+url);
		
		return new Connection(){

			@Override
			public Statement createStatement() {
				return new Statement(){

					@Override
					public ResultSet execute(String sql) {
						System.out.println("execute query :"+sql);
						
						return new ResultSet(){
							private int  next = 1;
							
							@Override
							public boolean hasNext() {
								next ++;
								if(next<9){
									return true;
								}
								return false;
							}

							@Override
							public String getString(String name) {
								if(name.equals("username")){
									return "jack"+next;
								}else{
									return "null"+next;
								}
							}

							@Override
							public int getInt(String name) {
								if(name.equals("age")){
									return 13*next;
								}else{
									return 2*next;
								}
							}
							
							@Override
							public void close(){
								System.out.println("ResultSet close!");
							}
							
						};
					}

					@Override
					public int executeUpdate(String sql) {
						System.out.println("execute query :"+sql);
						return 1;
					}
					
					@Override
					public void close(){
						System.out.println("Statement close!");
					}
					
				};
			}

			@Override
			public void close() {
				System.out.println("connection close ");
			}
		};
	}

}
