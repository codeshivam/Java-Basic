
class OSLogic
{
	public static void main(String...arg)throws Exception
	{
	Runtime run=Runtime.getRuntime();
	//run.exec("notepad");
	//run.exec("shutdown -s");
	//run.exec("shutdown -r");
	run.exec("shutdown -s -t 60");
	//run.exec("shutdown -l");
	}
}