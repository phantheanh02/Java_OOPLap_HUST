/*
 * Họ và tên: Phan Thế Anh
 * MssV: 20204941
 * Mã lớp: 721428
*/
package hust.soict.dsai.aims.media.model;

import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.Playable;

import java.util.Objects;

public class Track implements Playable {
    private String title;
    private int length;

    public Track() {

    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    /*
     * Họ và tên: Phan Thế Anh
     * MssV: 20204941
     * Mã lớp: 721428
    */
    @Override
    public void play() throws PlayerException {
        if(this.getLength() > 0) {
            System.out.println("Playing Track: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
        } else {
            System.err.println("ERROR: Track length is non-positive!");
            throw new PlayerException("ERROR: Track length is non-positive!");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return length == track.length && Objects.equals(title, track.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, length);
    }
}
