package com.biz.sevice;

public interface ScoreSevice {

	public boolean inPutScore(int number) throws NumberFormatException;

	public void makeTotal();

	public void makeRank();

	public void viewScore();
}
