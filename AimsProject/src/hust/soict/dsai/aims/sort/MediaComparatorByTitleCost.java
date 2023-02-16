/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 */
package hust.soict.dsai.aims.sort;

import java.util.Comparator;
import java.util.List;
import hust.soict.dsai.aims.media.Media;

public class MediaComparatorByTitleCost implements Comparator<Media> {

	@Override
	// Rewrite sort by title then cost
	public int compare(Media o1, Media o2) {
		// TODO Auto-generated method stub
		if (o1.getTitle().compareTo(o2.getTitle()) == 0) { // Compare title
			return Float.compare(o1.getCost(), o2.getCost()); // Them compare cost
		}
		return o1.getTitle().compareTo(o2.getTitle());
	}


}
