package  gitTest;



import java.io.Serializable;



public class RrtJcgl implements Serializable { 

	/**
	 * 
	 */
	private static final long serialVersionUID = 8870315774436242986L;
	/** 
	* 教程名称
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
	* 学科ID
	*/ 
	private		String	xkId;
	/** 
	* 排序
	*/ 
	private		Integer	sort;
	/** 
	* �?��教材Id,有则为教材下节点；没有则为教材本�?
	*/ 
	private		String	jcId;	

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

	public	String	 getJcId(){ 
		return jcId;
	}

	public	void	setJcId(String	 jcId){
		this.jcId	=	jcId;
	}
}
