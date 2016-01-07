package  gitTest;



import java.io.Serializable;



public class RrtZsdk  implements Serializable { 

	/**
	 * 
	 */
	private static final long serialVersionUID = -3800995876432186803L;
	/** 
	* 
	*/ 
	private		String	name;
	/** 
	* 
	*/ 
	private		String	pid;
	/** 
	* 
	*/ 
	private		String	parentName;
	/** 
	* 
	*/ 
	private		String	xkId;
	/** 
	* 
	*/ 
	private		Integer	sort;
	/** 
	* 
	*/ 
	private		String	zsdkId;
	
	/** 
	* 
	*/ 
	private		String	test;	

	public	String	 getName(){ 
		return name;
	}

	public	void	setName(String	 name){
		this.name	=	name;
	}

	public	String	 getPid(){ 
		return pid;
	}

	public	void	setPid(String	 pid){
		this.pid	=	pid;
	}

	public	String	 getParentName(){ 
		return parentName;
	}

	public	void	setParentName(String	 parentName){
		this.parentName	=	parentName;
	}

	public	String	 getXkId(){ 
		return xkId;
	}

	public	void	setXkId(String	 xkId){
		this.xkId	=	xkId;
	}

	public	Integer	 getSort(){ 
		return sort;
	}

	public	void	setSort(Integer	 sort){
		this.sort	=	sort;
	}

	public	String	 getZsdkId(){ 
		return zsdkId;
	}

	public	void	setZsdkId(String	 zsdkId){
		this.zsdkId	=	zsdkId;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}


}
