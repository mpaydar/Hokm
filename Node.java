
public class Node extends Card {
	protected String kind_info;
	protected int rank_info;
	protected Node next=null;
	protected Node previous=null;
	
	Node()
	{
		super();
		rank_info=super.card_rank;
		kind_info=super.card_kind;
	}

}
