package Sterilization;

import java.io.Serializable;

public class NFS_Game implements Serializable
{
String name;
int level;
long score;
int life;
public NFS_Game(String name, int level, long score, int life) 
{
	super();
	this.name = name;
	this.level = level;
	this.score = score;
	this.life = life;
}

}
