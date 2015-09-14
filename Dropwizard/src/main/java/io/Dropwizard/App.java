package io.Dropwizard;
import io.Dropwizard.resources.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
/**
 * Hello world!
 *
 */
public class App extends Application<SampleConfiguration>{
    
	
	public static void main( String[] args ) throws Exception
    {
		new App().run(args);
		// change1
		//change2
    }

	@Override
	public void run(SampleConfiguration arg0, Environment arg1)
			throws Exception {
		arg1.jersey().register(new HelloWorldResource());
		arg1.jersey().register(new PostRequest());
		arg1.healthChecks();
	}
}
