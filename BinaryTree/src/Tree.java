
public class Tree 
{
	//构造二叉树
	public Node creatTree(String str)
	{
		if(str.length()<=0)
			return null;
		Node[] nodeArray=new Node[str.length()];
		for(int i=0;i<=str.length()-1;i++)
		{
			if(nodeArray[i]==null&&str.charAt(i)!='#')
			{
				nodeArray[i]=new Node(str.charAt(i));
			}
			
			int num=2*i+1;
			if(num<=str.length()-1&&str.charAt(num)!='#')
			{
				nodeArray[num]=new Node(str.charAt(num));
				nodeArray[i].left=nodeArray[num];
			}
			num=num+1;
			if(num<=str.length()-1&&str.charAt(num)!='#')
			{
				nodeArray[num]=new Node(str.charAt(num));
				nodeArray[i].right=nodeArray[num];
			}
		}
		return nodeArray[0];
	}	

	//先序遍历
		public String preorder(Node root)
        {	
			char str;
			String str1="";
			if(root!=null)
			{
				str=root.value;
				str1=str1+String.valueOf(str);
        		str1=str1+preorder(root.left);
        		str1=str1+preorder(root.right);	
			}
			return str1 ;
        }
		//中序遍历
		public String sequence(Node root)
		{
			char str;
			String str1="";
			if(root!=null)
			{
				str1=str1+sequence(root.left);
				str=root.value;
				str1=str1+String.valueOf(str);
				str1=str1+sequence(root.right);
			}
			return str1;
		}
		//后序遍历
		public String epilogue(Node root)
		{
			char str;
			String str1="";
			if(root!=null)
			{
				str1=str1+epilogue(root.left);
				str1=str1+epilogue(root.right);
				str=root.value;
				str1=str1+String.valueOf(str);
			}
			return str1;
		}	
}
