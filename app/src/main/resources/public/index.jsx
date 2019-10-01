class App extends React.Component {
    render() {
        return (<div className="jumbotron jumbotron-fluid">
            <div className="container">
                <h1 className="display-4">Hello World</h1>
                <p className="lead">This is a modified jumbotron that occupies the entire horizontal space of its
                    parent.</p>
                <a className="btn btn-primary btn-lg" href="#" role="button">Learn more</a>
            </div>
        </div>);
    }
}
ReactDOM.render(<App/>, document.getElementById('root'));
