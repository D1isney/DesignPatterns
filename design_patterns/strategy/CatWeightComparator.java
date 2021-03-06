package strategy;

public class CatWeightComparator implements Comparator<Cat> {

	/**
	 * 按宽度排序
	 */
	@Override
	public int compar(Cat o1, Cat o2) {
		if(o1.weight< o2.weight) return -1;
		else if(o1.weight > o2.weight)return 1;
		else return 0;
	}


}
