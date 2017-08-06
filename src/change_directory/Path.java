package change_directory;

public class Path {
	private String path;

	public Path(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void cd(String newPath) {
		String[] newP=newPath.split("/");
		String[] oldP=path.split("/");
		int lnCount=0;
		for(String str:newP){
			if(str.equals("..")){
				lnCount++;
			}
		}

		int len=oldP.length;
		String strOut="";
		for(int i=0;i<len-lnCount;i++){
			strOut=strOut+oldP[i]+"/";
		}

		len=newP.length;
		for(int i=0;i<len;i++){
			if(!newP[i].equals("..")){
				strOut=strOut+newP[i]+"/";
			}
		}
		path=strOut.substring(0, strOut.length()-1);
		System.out.println(path);
		Path path = new Path(newPath);
	}
}
//Write a function that provides change directory (cd) function for an abstract file
//system.
//
//Notes:
//
// Root path is '/'.
//
// Path separator is '/'.
//
// Parent directory is addressable as 
//
// Directory names consist only of English alphabet letters (A-2 and a-z).
// The function will not be passed any invalid paths.
//
// Do not use built-in path-related functions.
//
//For example:
//
//Path path = new Path("/a/b/c/d");
//path.cd('../x'):
//System.out.print1n(path.getPath());
//
//should display '/a/b/c/x'.
