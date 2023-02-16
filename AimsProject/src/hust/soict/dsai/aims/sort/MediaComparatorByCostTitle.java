/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 */
package hust.soict.dsai.aims.sort;

import java.util.Comparator;
import hust.soict.dsai.aims.media.Media;

public class MediaComparatorByCostTitle implements Comparator<Media>{

	@Override
	// Rewrite method sort to compare by cost them title
	public int compare(Media o1, Media o2) {
		// TODO Auto-generated method stub
		if (Float.compare(o1.getCost(), o2.getCost()) == 0) { // Compare cost
			return o1.getTitle().compareTo(o2.getTitle()); // Then compare title
		}
		else return Float.compare(o1.getCost(), o2.getCost());
	}

}
