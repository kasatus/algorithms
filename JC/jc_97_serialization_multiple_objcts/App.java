package jc_97_serialization_multiple_objcts;

import org.spark_project.guava.net.InternetDomainName;

public class App {
	public static void main(String[] args) {
		final InternetDomainName topPrivateDomain = InternetDomainName.from("docs.cisco.com").topPrivateDomain();
		System.out.println(topPrivateDomain.topPrivateDomain());
	}
}
