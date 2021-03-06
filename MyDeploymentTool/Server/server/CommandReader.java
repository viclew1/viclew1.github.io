package server;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import common.Protocol;
import common.Reader;

public class CommandReader extends Reader{

	private String name,dest,dir;
	private int x1,y1,x2,y2;
	private boolean startResearch;
	private List<String> files,dests;

	public CommandReader(InputStream inputStream) {
		super(inputStream);
	}

	public void receive() throws IOException
	{
		type=readInt();
		switch(type)
		{
		case Protocol.RQ_CONNECT_ADMIN:
			name=readString();
			break;
		case Protocol.RQ_CONNECT:
			name=readString();
			break;
		case Protocol.RQ_DISCONNECT:
			break;
		case Protocol.RQ_DISCONNECT_ADMIN:
			name=readString();
			break;
		case Protocol.RQ_CLIENTS:
			name=readString();
			break;
		case Protocol.RQ_APPS:
			name=readString();
			dir=readString();
			break;
		case Protocol.RQ_DIR_NAMES:
			name=readString();
			break;
		case Protocol.RQ_INSTALL:
			name=readString();
			dir=readString();
			files=new ArrayList<String>();
			dests=new ArrayList<String>();
			int nbFiles=readInt();
			for (int i=0;i<nbFiles;i++)
				files.add(readString());
			int nbDests=readInt();
			for (int i=0;i<nbDests;i++)
				dests.add(readString());
			break;
		case Protocol.RQ_CONTROL:
			name=readString();
			dest=readString();
			break;
		case Protocol.RQ_STOP_CONTROL:
			name=readString();
			dest=readString();
			break;
		default:
			break;
		}
	}
	
	public String getName()
	{
		return name;
	}
	
	public int x1()
	{
		return x1;
	}
	
	public int y1()
	{
		return y1;
	}
	
	public int x2()
	{
		return x2;
	}
	
	public int y2()
	{
		return y2;
	}

	public boolean getStartResearch() {
		return startResearch;
	}

	public String getDir() {
		return dir;
	}
	
	public List<String> getFiles(){
		return files;
	}
	
	public List<String> getDests(){
		return dests;
	}
	
	public String getDest(){
		return dest;
	}

}
