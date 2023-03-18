package di;

class Worker {
	public void work()
	{
		
	}

}

class Manager{
	Worker worker;
	public void setWorker(Worker w)
	{
		worker = w;
	}
	
	public void manage()
	{
		worker.work();
	}
}


class SuperWorker{
	public void work()
	{
		
	}
}

