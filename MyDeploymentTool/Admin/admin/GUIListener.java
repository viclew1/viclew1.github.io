/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.util.List;

import admin.admindatas.App;
import admin.admindatas.Client;

public interface GUIListener {

	public void requestConnection(String name);

	public void lookForClients();

	public void requestFileNames(String dir);

	public void requestInstall(String dir, List<App> apps, List<Client> clients);

	public void requestControl(List<Client> clients);

	public void requestDirNames();
	
}
