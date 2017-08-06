package change_directory;

public class Main {

	public static void main(String[] args) {
		Path path = new Path("/a/b/c/d");
		path.cd("../x");
		System.out.println(path.getPath());

	}

}
