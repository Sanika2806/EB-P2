document.addEventListener('DOMContentLoaded', function() {
    // Dummy data (replace with actual API fetch)
    const newsData = [
        { title: 'Sample News Article 1', content: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit.' },
        { title: 'Sample News Article 2', content: 'Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.' },
        // Add more news articles as needed
    ];

    const newsList = document.getElementById('news-list');

    // Function to render news articles
    function renderNewsArticles(articles) {
        newsList.innerHTML = '';
        articles.forEach(article => {
            const articleElem = document.createElement('div');
            articleElem.classList.add('article');
            articleElem.innerHTML = `
                <h2>${article.title}</h2>
                <p>${article.content}</p>
            `;
            newsList.appendChild(articleElem);
        });
    }

    // Initial render
    renderNewsArticles(newsData);
});
