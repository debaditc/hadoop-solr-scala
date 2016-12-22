import org.apache.solr.client.solrj._
import org.apache.solr.client.solrj.response.QueryResponse
import org.apache.solr.client.solrj.impl._
import org.apache.solr.client.solrj.impl.HttpSolrServer

import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common._

import java.lang.String;
import java.util._

object connectsolr{
  
   def main(args : Array[String])
   {
    val solr = new HttpSolrServer("http://localhost:8983/solr/films");

    val query = new SolrQuery();
    query.setQuery("*");
    query.setParam("fl","directed_by")

    val response = solr.query(query);
    
    println(response);
    

  }
}