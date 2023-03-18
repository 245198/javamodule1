package di;

public interface IWorker {
	public void work();

}

class Worker2 implements IWorker{

	@Override
	public void work() {
	}
}

class SuperWorker2 implements IWorker{

	@Override
	public void work() {
	}
	
}

class Manager2
{
	IWorker worker ;
	public void setworker(IWorker w)
	{
	worker =w;	
	}
	public void manage()
	{
		worker.work();
	}
}

